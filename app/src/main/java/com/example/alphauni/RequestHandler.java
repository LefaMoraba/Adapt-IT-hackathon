package com.example.alphauni;


import org.json.JSONException;

public interface RequestHandler {
    public void processResponse(String response) throws JSONException;
}
