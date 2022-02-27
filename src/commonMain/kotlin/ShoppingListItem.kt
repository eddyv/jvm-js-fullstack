import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(val desc: String, val priority: Int) {
    val id: Int = desc.hashCode()

    // any changes to the endpoint name only needs to be done here. clients and server will be adjusted automatically
    companion object {
        const val path = "/shoppingList"
    }
}
