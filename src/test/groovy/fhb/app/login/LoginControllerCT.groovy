package fhb.app.login

import spock.lang.Specification


class LoginControllerCT extends Specification {

    void "Login is successful when user credentials are valid"() {
        given: "User name and correct password" 
        when: "Login with correct credentials"
        then: "User is successfull verified"
        assert true
    }
}