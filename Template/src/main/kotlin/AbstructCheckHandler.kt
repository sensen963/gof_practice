abstract class AbstructCheckHandler: RequestHandler
{
    override fun handle(request: Request): Response
    {
        if(checkCommonly(request) && checkExternally(request))
        {
            var modRequest = preProcessRequest(request)
            var response = requestToResponse(modRequest)
            return postProcessResponse(response)
        }
        throw Exception()
    }

    private fun checkCommonly(request: Request): Boolean
    {
        return !request.user.isNullOrBlank() && !request.resource.isNullOrBlank()
    }
    protected abstract fun checkExternally(request: Request): Boolean

    private fun preProcessRequest(request: Request):Request
    {
        return request
    }
    protected abstract fun requestToResponse(request: Request): Response

    private fun postProcessResponse(response: Response):Response
    {
        return response
    }
}