package org.addvert.marketresearch.typeformpollingservice.model

data class Forms(
    @Json(name = "total_items")
    val totalItems: Int? = null,
    @Json(name = "page_count")
    val pageCount: Int? = null,
    @Json(name = "items")
    val items: List<Item>? = null
)