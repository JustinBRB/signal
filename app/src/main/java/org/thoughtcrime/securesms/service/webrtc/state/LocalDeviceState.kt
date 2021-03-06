package org.thoughtcrime.securesms.service.webrtc.state

import org.thoughtcrime.securesms.components.sensors.Orientation
import org.thoughtcrime.securesms.ringrtc.CameraState
import org.thoughtcrime.securesms.webrtc.audio.SignalAudioManager

/**
 * Local device specific state.
 */
data class LocalDeviceState constructor(
  var cameraState: CameraState = CameraState.UNKNOWN,
  var isMicrophoneEnabled: Boolean = true,
  var orientation: Orientation = Orientation.PORTRAIT_BOTTOM_EDGE,
  var isLandscapeEnabled: Boolean = false,
  var deviceOrientation: Orientation = Orientation.PORTRAIT_BOTTOM_EDGE,
  var activeDevice: SignalAudioManager.AudioDevice = SignalAudioManager.AudioDevice.NONE,
  var availableDevices: Set<SignalAudioManager.AudioDevice> = emptySet(),
  var bluetoothPermissionDenied: Boolean = false
) {

  fun duplicate(): LocalDeviceState {
    return copy()
  }
}
