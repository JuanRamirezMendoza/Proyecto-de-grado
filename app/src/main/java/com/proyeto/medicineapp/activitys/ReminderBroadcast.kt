package com.proyeto.medicineapp.activitys
import android.content.BroadcastReceiver;
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.proyeto.medicineapp.R

class ReminderBroadcast: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var builder = NotificationCompat.Builder(context!!, "notify")
            .setSmallIcon(R.drawable.ic_add)
            .setContentTitle("Alerta")
            .setContentText("Hora de tomar el medicamento")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        var notificationManager = NotificationManagerCompat.from(context)

        notificationManager.notify(200, builder.build())

        val mediaPlayer = MediaPlayer.create(context,R.raw.ringtone)
        mediaPlayer.isLooping()

    }
}