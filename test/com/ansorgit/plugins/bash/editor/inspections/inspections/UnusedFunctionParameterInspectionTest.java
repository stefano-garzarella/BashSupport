package com.ansorgit.plugins.bash.editor.inspections.inspections;

public class UnusedFunctionParameterInspectionTest extends AbstractInspectionTestCase {
    public void testOk() throws Exception {
        doTest("unusedFunctionParameter/ok", new UnusedFunctionParameterInspection());
    }

    public void testUnusedFunctionParameter() throws Exception {
        doTest("unusedFunctionParameter/firstParamUnused", new UnusedFunctionParameterInspection());
    }

    public void testUnusedLastFunctionParameter() throws Exception {
        doTest("unusedFunctionParameter/lastParamUnused", new UnusedFunctionParameterInspection());
    }
}
