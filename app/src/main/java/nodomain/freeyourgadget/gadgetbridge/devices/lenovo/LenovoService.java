/*  Copyright (C) 2018 Nabil BENDAFI <nabil@bendafi.fr>

    This file is part of Gadgetbridge.

    Gadgetbridge is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Gadgetbridge is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. */
package nodomain.freeyourgadget.gadgetbridge.devices.lenovo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import nodomain.freeyourgadget.gadgetbridge.service.btle.GattCharacteristic;
import nodomain.freeyourgadget.gadgetbridge.service.btle.GattService;

import static nodomain.freeyourgadget.gadgetbridge.service.btle.AbstractBTLEDeviceSupport.BASE_UUID;

public class LenovoService {


    public static final UUID UUID_SERVICE_LENOVO_HW01_A = UUID.fromString((String.format(BASE_UUID, "190A")));
    public static final UUID UUID_SERVICE_LENOVO_HW01_B = UUID.fromString((String.format(BASE_UUID, "190B")));

    public static final UUID UUID_SERVICE_GENERIC_ACCESS = UUID.fromString((String.format(BASE_UUID, "1800")));
    public static final UUID UUID_CHARACTERISTIC_DEVICE_NAME = UUID.fromString((String.format(BASE_UUID, "2A00")));

    public static final UUID UUID_CHARACTERISTIC_RX = UUID.fromString(String.format(BASE_UUID, "0003"));
    public static final UUID UUID_CHARACTERISTIC_TX = UUID.fromString(String.format(BASE_UUID, "0004"));

    public static final UUID UUID_CHARACTERISTIC_CLIENT_CONFIG = UUID.fromString((String.format(BASE_UUID, "2902")));
}
