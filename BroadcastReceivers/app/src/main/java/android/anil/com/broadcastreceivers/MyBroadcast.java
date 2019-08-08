package android.anil.com.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Sra on 12/24/15.
 */
public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int bstatus=intent.getIntExtra("level",0);
        Toast.makeText(context, "Your Battery Status is : "+bstatus, Toast.LENGTH_SHORT).show();
    }
}
