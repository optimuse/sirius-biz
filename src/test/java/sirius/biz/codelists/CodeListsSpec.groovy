/*
 * Made with all the love in the world
 * by scireum in Remshalden, Germany
 *
 * Copyright by scireum GmbH
 * http://www.scireum.de - info@scireum.de
 */

package sirius.biz.codelists

import sirius.biz.tenants.TenantsHelper
import sirius.db.mixing.OMA
import sirius.kernel.BaseSpecification
import sirius.kernel.di.std.Part

import java.time.Duration

class CodeListsSpec extends BaseSpecification {

    @Part
    private static CodeLists cl

    @Part
    private static OMA oma

    def setupSpec() {
        oma.getReadyFuture().await(Duration.ofSeconds(60))
    }

    def "get entries of a code list works"() {
        given:
        TenantsHelper.installTestTenant()
        when:
        List<CodeListEntry> entries = cl.getEntries("test")
        then:
        entries.isEmpty()
    }

    def "auto-creating a list and values works"() {
        given:
        TenantsHelper.installTestTenant()
        when:
        String value = cl.getValue("test", "testCode")
        then:
        value == "testCode"
    }

}
