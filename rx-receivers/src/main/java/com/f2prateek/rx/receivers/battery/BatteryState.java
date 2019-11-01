package com.f2prateek.rx.receivers.battery;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue public abstract class BatteryState {
  @CheckResult @NonNull //
  public static BatteryState create(BatteryHealth health, int iconSmall, int level, int plugged,
      boolean present, int scale, BatteryStatus status, @Nullable String technology,
      int temperature, int voltage) {
    return new AutoValue_BatteryState(health, iconSmall, level, plugged, present, scale, status,
        technology, temperature, voltage);
  }

  public abstract BatteryHealth health();

  public abstract int iconSmall();

  public abstract int level();

  public abstract int plugged();

  public abstract boolean present();

  public abstract int scale();

  public abstract BatteryStatus status();

  public abstract @Nullable String technology();

  public abstract int temperature();

  public abstract int voltage();
}
