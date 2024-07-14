package com.batterlevel.musicapp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers("X-Rapidapi-Key: 05becd0123msh32e956edd7c8f23p1f4620jsn581216b2c598",
        "X-Rapidapi-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") q:String) : Call<MyMusicData>

}