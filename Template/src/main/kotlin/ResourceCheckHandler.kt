class ResourceCheckHandler(): AbstructCheckHandler() {

    protected override fun checkExternally(request: Request): Boolean {
       return request.resource.lowercase().contains("please")
    }

    protected override fun requestToResponse(request: Request): Response {
        return Response("Request Accepted.")
    }
}