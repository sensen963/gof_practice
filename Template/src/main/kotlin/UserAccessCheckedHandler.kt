import java.util.Dictionary

class UserAccessCheckedHandler(): AbstructCheckHandler() {
    private var users = setOf("Alice", "Bob", "Cathy")
    protected override fun checkExternally(request: Request): Boolean {
        return users.contains(request.user)
    }

    protected override fun requestToResponse(request: Request): Response {
        return Response("${request.user} is accepted.")
    }
}