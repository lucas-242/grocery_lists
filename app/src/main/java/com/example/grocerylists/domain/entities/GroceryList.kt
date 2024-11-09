package com.example.grocerylists.domain.entities

data class GroceryList(var id:String, var name: String, var items: List<GroceryItem>)
