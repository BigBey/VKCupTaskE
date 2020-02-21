package ru.bey_sviatoslav.android.vkcuptaske

import com.vk.api.sdk.requests.VKRequest
import org.json.JSONObject

class VKOwnerIdRequest: VKRequest<Int> {
    constructor(): super("users.get")

    override fun parse(r: JSONObject):  Int{
        val response = r.getJSONArray("response")
        val result = response.getJSONObject(0).getInt("id")
        return result
    }
}