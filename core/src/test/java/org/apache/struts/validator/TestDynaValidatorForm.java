/*
 * Copyright 2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts.validator;

import junit.framework.TestCase;
import org.apache.struts.action.ActionMapping;

public class TestDynaValidatorForm extends TestCase {

    // ----------------------------------------------------------- Constructors
    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public TestDynaValidatorForm(String name) {
        super(name);
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Test value of determine page.
     */
    public void testDeterminePage01() {
        DynaValidatorForm validatorForm = new DynaValidatorForm();
        ActionMapping mapping = new ActionMapping();

        mapping.setAcceptPage(null);
        validatorForm.setPage(-1);
        int page = validatorForm.determinePage(mapping, null);

        assertEquals(Integer.MAX_VALUE, page);
    }

    /**
     * Test value of determine page.
     */
    public void testDeterminePage02() {
        DynaValidatorForm validatorForm = new DynaValidatorForm();
        ActionMapping mapping = new ActionMapping();

        mapping.setAcceptPage(new Integer(-1));
        validatorForm.setPage(-1);
        int page = validatorForm.determinePage(mapping, null);

        assertEquals(-1, page);
    }

    /**
     * Test value of determine page.
     */
    public void testDeterminePage03() {
        DynaValidatorForm validatorForm = new DynaValidatorForm();
        ActionMapping mapping = new ActionMapping();

        mapping.setAcceptPage(new Integer(-1));
        validatorForm.setPage(0);
        int page = validatorForm.determinePage(mapping, null);

        assertEquals(0, page);
    }

    /**
     * Test value of determine page.
     */
    public void testDeterminePage04() {
        DynaValidatorForm validatorForm = new DynaValidatorForm();
        ActionMapping mapping = new ActionMapping();

        mapping.setAcceptPage(new Integer(-1));
        validatorForm.setPage(1);
        int page = validatorForm.determinePage(mapping, null);

        assertEquals(1, page);
    }
}
