open class Access() {
    protected var shop: String = "" // accessible to class which inherits Access class
    private var name: String = "" // not accessible to any outer class
    internal var device: String = "" // accessible to all classes within a module
    public var laptop : String = "" // accessible from everywhere
}

class InheritAccess: Access() {
    var inheritShop = shop
}