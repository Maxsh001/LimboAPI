/*
 * Copyright (C) 2021 - 2025 Elytrium
 *
 * The LimboAPI (excluding the LimboAPI plugin) is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package net.elytrium.limboapi.api.chunk.util;

import com.velocitypowered.api.network.ProtocolVersion;

public interface CompactStorage {

  void set(int index, int value);

  int get(int index);

  void write(Object byteBufObject, ProtocolVersion version);

  int getBitsPerEntry();

  @Deprecated(forRemoval = true)
  default int getDataLength() {
    return this.getDataLength(ProtocolVersion.MINIMUM_VERSION);
  }

  int getDataLength(ProtocolVersion version);

  long[] getData();

  CompactStorage copy();
}
