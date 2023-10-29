class ListView(val items: Array<String>) {
    inner class ListViewItems() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}