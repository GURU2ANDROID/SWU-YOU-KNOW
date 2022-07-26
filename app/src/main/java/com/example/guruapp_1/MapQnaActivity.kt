package com.example.guruapp_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView


class MapQnaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_qna)

        val email = findViewById<View>(R.id.btnemail) as TextView
        val call = findViewById<View>(R.id.btncall) as TextView

        email.setOnClickListener { // 이메일 보내기
            val email = Intent(Intent.ACTION_SEND)
            email.type = "plain/text"
            val address = arrayOf("juwon_0715@naver.com")
            email.putExtra(Intent.EXTRA_EMAIL, address)
            email.putExtra(Intent.EXTRA_SUBJECT, "제목을 입력하세요.")
            email.putExtra(Intent.EXTRA_TEXT, "내용을 입력하세요.")
            startActivity(email)
        }

        call.setOnClickListener { // 전화 걸기
            val call = Intent(Intent.ACTION_DIAL)
            call.data = Uri.parse("tel:01011111111")
            if(intent.resolveActivity(packageManager) != null) {
                startActivity(call)
            }
        }
    }
}