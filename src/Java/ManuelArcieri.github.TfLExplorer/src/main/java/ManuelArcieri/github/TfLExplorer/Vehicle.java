/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package ManuelArcieri.github.TfLExplorer;

import com.google.gson.JsonObject;

/**
 A vehicle involved in an AccidentStats accident
 */
public class Vehicle
{
    public String type;

    /**
     Create a new ManuelArcieri.github.TfLExplorer.Vehicle reading all its properties from its JSON object

     @param vehicleElement A JSON element containing a ManuelArcieri.github.TfLExplorer.Casualty object
     */
    public Vehicle(JsonObject vehicleElement)
    {
        type = vehicleElement.get("type").getAsString();
    }
}
