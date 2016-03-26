package org.csisd.forum

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['permitAll'])
@Transactional(readOnly = true)
class DiscussionThreadController {
    static scaffold = DiscussionThread
}
