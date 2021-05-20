package info.nightscout.androidaps.danars.comm

import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import info.nightscout.androidaps.danars.DanaRSTestBase
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class DanaRsPacketBolusGetExtendedMenuOptionStateTest : DanaRSTestBase() {

    private val packetInjector = HasAndroidInjector {
        AndroidInjector {
            if (it is DanaRS_Packet_Bolus_Get_Extended_Menu_Option_State) {
                it.aapsLogger = aapsLogger
                it.danaPump = danaPump
            }
        }
    }

    @Test fun runTest() {
        val packet = DanaRS_Packet_Bolus_Get_Extended_Menu_Option_State(packetInjector)
        Assert.assertEquals(null, packet.requestParams)
        // test message decoding
        packet.handleMessage(createArray(34, 0.toByte()))
        // isExtendedInProgress should be false
        Assert.assertEquals(false, packet.isExtendedInProgress)
        //        assertEquals(false, packet.failed);
        packet.handleMessage(createArray(34, 1.toByte()))
        Assert.assertEquals(true, packet.isExtendedInProgress)
        Assert.assertEquals("BOLUS__GET_EXTENDED_MENU_OPTION_STATE", packet.friendlyName)
    }
}