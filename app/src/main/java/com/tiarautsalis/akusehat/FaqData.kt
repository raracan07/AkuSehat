package com.tiarautsalis.akusehat

data class FaqData(
    val title: String,
    val desc: String,
    var isExpandable: Boolean = false
)