package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInPickItem implements Packet<PacketListenerPlayIn> {

    private int a;

    public PacketPlayInPickItem() {}

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
        this.a = packetdataserializer.g();
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
        packetdataserializer.d(this.a);
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
        packetlistenerplayin.a(this);
    }

    public int b() {
        return this.a;
    }
}
