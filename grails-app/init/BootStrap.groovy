import bear.User

class BootStrap {

    def init = { servletContext ->
        ["aaa", 'bbb', 'ccc', 'ddd', 'eee'].eachWithIndex { name, idx ->
            User user = new User(
                    userName: name,
                    cmsSiteId: idx * 111
            )
            user.save(failOnError: true)
        }
    }
    def destroy = {
    }
}
