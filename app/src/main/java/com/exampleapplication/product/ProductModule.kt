package com.exampleapplication.product

import org.koin.dsl.module

val product = module {
    factory {
        ProductRepository(get())
    }
}