package com.example.guruapp_1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

// 교내상점 맵
class MapActivity : AppCompatActivity() {

    lateinit var anniMap: ImageButton
    lateinit var audMap: ImageButton
    lateinit var insaMap: ImageButton
    lateinit var joyeMap: ImageButton
    lateinit var libcafeMap: ImageButton
    lateinit var nuriMap: ImageButton
    lateinit var shalomMap: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        anniMap = findViewById<ImageButton>(R.id.imageButton50)
        audMap = findViewById<ImageButton>(R.id.imageButtonTgd)
        insaMap = findViewById<ImageButton>(R.id.imageButtonInsa)
        joyeMap = findViewById<ImageButton>(R.id.imageButtonJoye)
        libcafeMap = findViewById<ImageButton>(R.id.imageButtonLibrary)
        nuriMap = findViewById<ImageButton>(R.id.imageButtonNuri)
        shalomMap = findViewById<ImageButton>(R.id.imageButtonShalom)

        anniMap.setOnClickListener() {
            var intent = Intent(this, Anniversary50thActivity::class.java)
            startActivity(intent)
        }
        audMap.setOnClickListener() {
            var intent = Intent(this, AuditoriumActivity::class.java)
            startActivity(intent)
        }
        insaMap.setOnClickListener() {
            var intent = Intent(this, InsagwanActivity::class.java)
            startActivity(intent)
        }
        joyeMap.setOnClickListener() {
            var intent = Intent(this, JoyegwanActivity::class.java)
            startActivity(intent)
        }
        libcafeMap.setOnClickListener() {
            var intent = Intent(this, LibraryCafeActivity::class.java)
            startActivity(intent)
        }
        nuriMap.setOnClickListener() {
            var intent = Intent(this, NurigwanActivity::class.java)
            startActivity(intent)
        }
        shalomMap.setOnClickListener() {
            var intent = Intent(this, ShalomActivity::class.java)
            startActivity(intent)
        }
    }

    // 문의사항 메뉴(map_menu_qna) 연결
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.map_menu_qna, menu)
        return true
    }

    // 문의사항(action_qna) 선택 시 MapQnaActivity로 전환
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId) {
            R.id.action_qna -> {
                val intent = Intent(this, MapQnaActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
