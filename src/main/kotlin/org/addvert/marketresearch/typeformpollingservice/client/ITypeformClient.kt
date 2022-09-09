package org.addvert.marketresearch.typeformpollingservice.client

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client
import org.addvert.marketresearch.typeforminsightsgenerator.configuration.TypeformConfiguration


@Client(TypeformConfiguration.TYPEFORM_API_URL)
interface ITypeformClient {

    @Get("/forms/{formId}/responses")
    fun fetchResponses(
        @Header(name = "Authorization") authorization: String?,
        @PathVariable formId: String,
        @QueryValue("page_size") pageSize: Int?,
        @QueryValue before:String?
    ): String?

    @Get("/forms/{formId}")
    fun fetchForm(
        @Header(name = "Authorization") authorization: String?,
        @PathVariable formId: String
    ): String?

    @Get("/forms")
    fun fetchAllForms(
        @Header(name = "Authorization") authorization: String?
    ): String?

}