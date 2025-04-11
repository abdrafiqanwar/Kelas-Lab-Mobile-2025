package com.example.recyclerview;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Chat> chats = generateDummyChats();

    private static ArrayList<Chat> generateDummyChats() {
        ArrayList<Chat> chats = new ArrayList<>();

        chats.add(new Chat(R.drawable.adel, "Adel", "Haii", "12.00"));
        chats.add(new Chat(R.drawable.adit, "Adit", "Halooo", "13.00"));
        chats.add(new Chat(R.drawable.anas, "Anas", "mas anis", "23.50"));
        chats.add(new Chat(R.drawable.dennis, "Dennis", "salam", "15.03"));
        chats.add(new Chat(R.drawable.devi, "Devi", "kerja tugas", "16.09"));
        chats.add(new Chat(R.drawable.hjudin, "Hjudin", "lab bsk", "12.41"));
        chats.add(new Chat(R.drawable.jarwo, "Jarwo", "adiitttt", "00.21"));
        chats.add(new Chat(R.drawable.mita, "Mita", "weee", "09.42"));
        chats.add(new Chat(R.drawable.sopo, "Sopo", "jarwoo", "16.32"));
        chats.add(new Chat(R.drawable.ucup, "Ucup", "salkir", "09.22"));

        return chats;
    }
}
