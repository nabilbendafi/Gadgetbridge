package nodomain.freeyourgadget.gadgetbridge.devices.lenovo;

import java.util.UUID;

import static nodomain.freeyourgadget.gadgetbridge.service.btle.AbstractBTLEDeviceSupport.BASE_UUID;

public class LenovoConstants {
    public static final UUID UUID_SERVICE_LENOVO_HW01_A = UUID.fromString((String.format(AbstractBTLEDeviceSupport.BASE_UUID, "190A")));
    public static final UUID UUID_SERVICE_LENOVO_HW01_A = UUID.fromString((String.format(AbstractBTLEDeviceSupport.BASE_UUID, "190B")));

    public static final UUID UUID_SERVICE_GENERIC_ACCESS = UUID.fromString((String.format(AbstractBTLEDeviceSupport.BASE_UUID, "1800")));
    public static final UUID UUID_CHARACTERISTIC_DEVICE_NAME = UUID.fromString((String.format(AbstractBTLEDeviceSupport.BASE_UUID, "2A00")));

    public static final UUID UUID_CHARACTERISTIC_RX = UUID.fromString(String.format(BASE_UUID, "0003"));
    public static final UUID UUID_CHARACTERISTIC_TX = UUID.fromString(String.format(BASE_UUID, "0004"));

    public static final UUID UUID_CHARACTERISTIC_CLIENT_CONFIG = UUID.fromString((String.format(AbstractBTLEDeviceSupport.BASE_UUID, "2902")));
}
