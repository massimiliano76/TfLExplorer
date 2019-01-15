/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class AccidentStatsClientTest extends TfLApiClientTest
{
    protected AccidentStatsClient accidentStatsClient = null;

    @BeforeEach
    void setUpAccidentStatsClient()
    {
        if (appIdAndAppKeyArePresent())
            accidentStatsClient = new AccidentStatsClient(appId, appKey);
    }

    @Test
    void getAccidentsIn2016()
    {
        assumeAppIdAndAppKeyPresence();
        assertDoesNotThrow(() -> {
            Response response = accidentStatsClient.getAccidentsPerYear(2016);
            int x = 1;
        }, "");
    }
}