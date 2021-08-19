package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should respond with 'hello'"
    request {
        method GET()
        url("/hello") {
        }
    }
    response {
        body("Hello World")
        status 200
    }
}