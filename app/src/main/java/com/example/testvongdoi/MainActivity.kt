package com.example.testvongdoi

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/**
 * Activity và Fragment có 4 trạng thái cơ bản:
 * Visible Lifecycle: Vòng đời có thể nhìn thấy,
là một phần của vòng đời giữa onStart() và onStop() khi Activity được hiển thị.
 * Focus: Activity sẽ ở trạng thái focus khi nó là hoạt động mà người dùng có thể tương tác.
 * Foreground: Là khi mà Activity vẫn hiển thị trên màn hình.
 * Background:Lúc này Activity hoàn toàn bị che mất và không còn hiển thị lên màn hình.
 *
 *
 * Vòng đời của Fragment và Activity đều có 5 trạng thái giống nhau(trạng thái cua vong doi chu khong phải vòng đời nha):
 * Initialized: Đây là trạng thái bắt đầu khi bạn thực hiện tạo một Activity mới.
Đây là trạng thái tạm thời - nó sẽ ngay lập tức chuyển đến Created.
 * Created: Lúc này Activity vừa được tạo,
nhưng nó chưa hiển thị và chưa được focus (bạn không thể tương tác với nó).
 * Started: Activity được hiển thị nhưng bạn vẫn không thể tương tác được do nó chưa được focus.
 * Resumed: Lúc này Activity đang hoạt đông, nó được hiển thị và người dùng có thể tương tác được.
 * Destroyed: Activity đã bị hủy, người dùng không còn tương tác được với nó.
 */


class MainActivity : AppCompatActivity() {


    override fun onStart() {
        super.onStart()
        Log.d(
            "TAGCUATRINH", "onStart(): Được gọi khi Activity sắp hiển thị lên màn hình" +
                    " nhưng chưa tương tác được với người dùng"
        )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(
            "TAGCUATRINH",
            "onRestart(): Được gọi khi một Activity đang ở trạng thái bị dừng (không hiển thị nhưng vẫn tồn tại trong bộ nhớ) " +
                    "và sắp quay lại tương tác với người dùng. " +
                    "Phương thức này được gọi trước onStart() khi Activity được khởi động lại."
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<TextView>(R.id.tvChuyenman)
        val btnFragment = findViewById<TextView>(R.id.tvFragment)
        val fragmentContainer = findViewById<FrameLayout>(R.id.frameFragment)

        btnStart.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
            // khi finish thi chạy đên dau, ma khong finish thi chay den dau ở vòng đời
        }
        btnFragment.setOnClickListener {
            val fragment = BlankFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameFragment, fragment)
                .commit()
        }


        Log.d(
            "TAGCUATRINH", "onCreate(): Được gọi khi Activity lần đầu được tạo ra." +
                    " Đây là nơi thiết lập giao diện người dùng"
        )
        // cai nay can thiet phai hieu
        // câu hỏi: lần đầu activity được tạo ra là khi nao?
    }
    override fun onResume() {
        super.onResume()
        Log.d("TAGCUATRINH", "onResume(): Được gọi khi Activity bắt đầu tương tác với người dùng.")

        // cai nay can thiet phai hieu luc nao no chay toi day
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            "TAGCUATRINH", "onPause(): Được gọi khi Activity chuẩn bị bị ngừng lại " +
                    "hoặc không còn tương tác với người dùng."
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGCUATRINH", "onStop(): Được gọi khi Activity không còn hiển thị lên màn hình.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGCUATRINH", "onDestroy(): Được gọi khi Activity bị hủy và không còn tồn tại nữa.")
        // cai nay can thiet phai hieu luc nao no chay toi day
    }
}