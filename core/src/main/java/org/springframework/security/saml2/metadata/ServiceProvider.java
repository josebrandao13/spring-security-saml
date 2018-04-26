/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.metadata;

import java.util.List;

/**
 * Represents an SPSSODescriptor
 * https://www.oasis-open.org/committees/download.php/35391/sstc-saml-metadata-errata-2.0-wd-04-diff.pdf
 */
public class ServiceProvider extends SsoProvider {

    private boolean authnRequestsSigned;
    private boolean wantAssertionsSigned;
    private List<Endpoint> assertionConsumerService;
    //private List<AttributeConsumingService> attributeConsumingService;

    public boolean getAuthnRequestsSigned() {
        return authnRequestsSigned;
    }

    public boolean getWantAssertionsSigned() {
        return wantAssertionsSigned;
    }

    public List<Endpoint> getAssertionConsumerService() {
        return assertionConsumerService;
    }

//    public List<Endpoint> getAttributeConsumingService() {
//        return attributeConsumingService;
//    }

    public ServiceProvider setAuthnRequestsSigned(boolean authnRequestsSigned) {
        this.authnRequestsSigned = authnRequestsSigned;
        return this;
    }

    public ServiceProvider setWantAssertionsSigned(boolean wantAssertionsSigned) {
        this.wantAssertionsSigned = wantAssertionsSigned;
        return this;
    }

    public ServiceProvider setAssertionConsumerService(List<Endpoint> assertionConsumerService) {
        this.assertionConsumerService = assertionConsumerService;
        return this;
    }

//    public ServiceProvider setAttributeConsumingService(List<Endpoint> attributeConsumingService) {
//        this.attributeConsumingService = attributeConsumingService;
//        return this;
//    }
}