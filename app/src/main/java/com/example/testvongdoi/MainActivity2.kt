package com.example.testvongdoi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(
            "TAGCUATRINH", "onCreate(): Được gọi khi Activity lần đầu được tạo ra." +
                    " Đây là nơi thiết lập giao diện người dùng"
        )

    }

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

    override fun onResume() {
        super.onResume()
        Log.d("TAGCUATRINH", "Được gọi khi Activity bắt đầu tương tác với người dùng.")

        // cai nay can thiet phai hieu luc nao no chay toi day
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            "TAGCUATRINH", "Được gọi khi Activity chuẩn bị bị ngừng lại " +
                    "hoặc không còn tương tác với người dùng."
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGCUATRINH", "Được gọi khi Activity không còn hiển thị lên màn hình.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGCUATRINH", "Được gọi khi Activity bị hủy và không còn tồn tại nữa.")
        // cai nay can thiet phai hieu luc nao no chay toi day
        // luc nao no khong chạy tới
    }


}