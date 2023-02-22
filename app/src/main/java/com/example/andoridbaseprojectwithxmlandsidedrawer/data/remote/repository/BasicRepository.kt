package com.example.andoridbaseprojectwithxmlandsidedrawer.data.remote.repository

import com.example.andoridbaseprojectwithxmlandsidedrawer.data.remote.api.BasicApiInterface
import com.example.andoridbaseprojectwithxmlandsidedrawer.data.remote.response.ResponseModel
import com.example.andoridbaseprojectwithxmlandsidedrawer.utils.network.NetworkResult
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import javax.inject.Inject

class BasicRepository @Inject constructor(
    private val apiInterface: BasicApiInterface
) {
    suspend fun sendMultipartData(content: String,image: File): NetworkResult<ResponseModel> {
        val requestBody =  MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("image", image.path,image.asRequestBody())
            .addFormDataPart("content",content)
            .build()
        return apiInterface.sendMultipartRequest(requestBody)
    }
}