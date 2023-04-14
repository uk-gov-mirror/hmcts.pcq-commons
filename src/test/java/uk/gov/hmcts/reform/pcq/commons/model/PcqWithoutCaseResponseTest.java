package uk.gov.hmcts.reform.pcq.commons.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PcqWithoutCaseResponseTest {

    private final String[] pcqIds = {"PCQ_ID1", "PCQ_ID2"};
    private static final String[] EMPTY_PCQID_ARRAY = {};
    private static final String STATUS = "Success";
    private static final String STATUS_CODE = "200";

    @Test
    void testPcqWithoutCaseResponse() {
        PcqWithoutCaseResponse pcqWithoutCaseResponse = new PcqWithoutCaseResponse();
        pcqWithoutCaseResponse.setPcqId(pcqIds);
        pcqWithoutCaseResponse.setResponseStatus(STATUS);
        pcqWithoutCaseResponse.setResponseStatusCode(STATUS_CODE);

        assertArrayEquals(pcqIds, pcqWithoutCaseResponse.getPcqId(),"PCQ Ids don't match");
        assertEquals(STATUS, pcqWithoutCaseResponse.getResponseStatus(),"Response status doesn't match");
        assertEquals(STATUS_CODE, pcqWithoutCaseResponse.getResponseStatusCode(),"Response status code doesn't match");
    }

    @Test
    void testPcqWithoutCaseResponseNullPcqs() {
        PcqWithoutCaseResponse pcqWithoutCaseResponse = new PcqWithoutCaseResponse();
        pcqWithoutCaseResponse.setPcqId(null);

        assertArrayEquals(EMPTY_PCQID_ARRAY, pcqWithoutCaseResponse.getPcqId(),"PCQ Ids don't match");
    }
}
