// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.netty;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Connection extends Table {
  public static Connection getRootAsConnection(ByteBuffer _bb) { return getRootAsConnection(_bb, new Connection()); }
  public static Connection getRootAsConnection(ByteBuffer _bb, Connection obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Connection __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startConnection(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endConnection(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

