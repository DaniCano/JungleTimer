package com.example.jungletimer;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment {
	private Button vilemaw;

	private Button inibblue1;
	private Button inibblue2;
	private Button golemblue;
	private Button wraithblue;
	private Button wolvesblue;

	private Button inibpurple1;
	private Button inibpurple2;
	private Button golempurple;
	private Button wraithpurple;
	private Button wolvespurple;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment2, container, false);
		
		//Inicialitzacio de Buttons

		// Vilemaw
		vilemaw = (Button) rootView.findViewById(R.id.vilemaw);

		vilemaw.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				vilemaw.setEnabled(false);
				vilemaw.setBackgroundResource(R.drawable.vilemawdead);
				matarVilemaw();
			}
		});

		// Blue Team
		inibblue1 = (Button) rootView.findViewById(R.id.inibblue);
		inibblue1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibblue1.setEnabled(false);
				inibblue1.setBackgroundResource(R.drawable.inibdead);
				matarInibblue1();
			}
		});
		inibblue2 = (Button) rootView.findViewById(R.id.inibblue2);
		inibblue2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibblue2.setEnabled(false);
				inibblue2.setBackgroundResource(R.drawable.inibdead);
				matarInibblue2();
			}
		});
		golemblue = (Button) rootView.findViewById(R.id.golemblue);
		golemblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				golemblue.setEnabled(false);
				golemblue.setBackgroundResource(R.drawable.golemdead);
				matarGolemBlue();
			}
		});
		wraithblue = (Button) rootView.findViewById(R.id.wraithblue);
		wraithblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wraithblue.setEnabled(false);
				wraithblue.setBackgroundResource(R.drawable.wraithdead);
				matarWraithBlue();
			}
		});
		wolvesblue = (Button) rootView.findViewById(R.id.wolvesblue);
		wolvesblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wolvesblue.setEnabled(false);
				wolvesblue.setBackgroundResource(R.drawable.wolvesdead);
				matarWolvesBlue();
			}
		});

		// Purple Team
		wolvespurple = (Button) rootView.findViewById(R.id.wolvespurple);
		wolvespurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wolvespurple.setEnabled(false);
				wolvespurple.setBackgroundResource(R.drawable.wolvesdead);
				matarWolvesPurple();
			}
		});
		inibpurple1 = (Button) rootView.findViewById(R.id.inibpurple1);
		inibpurple1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibpurple1.setEnabled(false);
				inibpurple1.setBackgroundResource(R.drawable.inibdead);
				matarInibPurple1();
			}
		});
		inibpurple2 = (Button) rootView.findViewById(R.id.inibpurple2);
		inibpurple2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibpurple2.setEnabled(false);
				inibpurple2.setBackgroundResource(R.drawable.inibdead);
				matarInibPurple2();
			}
		});
		golempurple = (Button) rootView.findViewById(R.id.golemspurple);
		golempurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				golempurple.setEnabled(false);
				golempurple.setBackgroundResource(R.drawable.golemdead);
				matarGolemsPurple();
			}
		});
		wraithpurple = (Button) rootView.findViewById(R.id.wraithpurple);
		wraithpurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wraithpurple.setEnabled(false);
				wraithpurple.setBackgroundResource(R.drawable.wraithdead);
				matarWraithsPurple();
			}
		});

		return rootView;

	}
	////////////////////////////////////////////////////////////////////
	// mètodes de cronòmetre
	////////////////////////////////////////////////////////////////////

	private void matarVilemaw() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				vilemaw.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				vilemaw.setEnabled(true);
				vilemaw.setText("");
				vilemaw.setBackgroundResource(R.drawable.vilemaw);
			}
		}.start();
	}

	private void matarInibblue1() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibblue1.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				inibblue1.setEnabled(true);
				inibblue1.setText("");
				inibblue1.setBackgroundResource(R.drawable.inibblue);
			}
		}.start();
	}

	private void matarInibblue2() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibblue2.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				inibblue2.setEnabled(true);
				inibblue2.setText("");
				inibblue2.setBackgroundResource(R.drawable.inibblue);
			}
		}.start();
	}

	private void matarGolemBlue() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				golemblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				golemblue.setEnabled(true);
				golemblue.setText("");
				golemblue.setBackgroundResource(R.drawable.golemblue);
			}
		}.start();
	}

	private void matarWraithBlue() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				wraithblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				wraithblue.setEnabled(true);
				wraithblue.setText("");
				wraithblue.setBackgroundResource(R.drawable.wraithblue);
			}
		}.start();
	}

	private void matarWolvesBlue() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				wolvesblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				wolvesblue.setEnabled(true);
				wolvesblue.setText("");
				wolvesblue.setBackgroundResource(R.drawable.wolveblue);
			}
		}.start();
	}

	private void matarWolvesPurple() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				wolvespurple.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				wolvespurple.setEnabled(true);
				wolvespurple.setText("");
				wolvespurple.setBackgroundResource(R.drawable.wolvespurple);
			}
		}.start();
	}

	private void matarGolemsPurple() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				golempurple.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				golempurple.setEnabled(true);
				golempurple.setText("");
				golempurple.setBackgroundResource(R.drawable.golempurple);
			}
		}.start();
	}

	private void matarWraithsPurple() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				wraithpurple.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				wraithpurple.setEnabled(true);
				wraithpurple.setText("");
				wraithpurple.setBackgroundResource(R.drawable.wraithpurple);
			}
		}.start();
	}

	private void matarInibPurple1() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibpurple1.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				inibpurple1.setEnabled(true);
				inibpurple1.setText("");
				inibpurple1.setBackgroundResource(R.drawable.inibpurple);
			}
		}.start();
	}

	private void matarInibPurple2() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibpurple2.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished/1000 == timeDelay()){
					if (box1()) {
						vibrar();
					}
					if (box2()) {
						reproduirSo(R.raw.timedelay);
					}
				}
			}

			@Override
			public void onFinish() {
				// Posem el botó en enable
				if (box1()) {
					vibrar();
				}
				if (box2()) {
					reproduirSo(R.raw.login);
				}
				inibpurple2.setEnabled(true);
				inibpurple2.setText("");
				inibpurple2.setBackgroundResource(R.drawable.inibpurple);
			}
		}.start();
	}

	private void reproduirSo(int sound) {
		MediaPlayer mediaPlayer = MediaPlayer.create(getActivity()
				.getBaseContext(), sound);
		mediaPlayer.start();
	}

	private void vibrar() {
		Vibrator v = (Vibrator) getActivity().getSystemService(
				Context.VIBRATOR_SERVICE);
		v.vibrate(1000);
	}

	private boolean box1() {
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
		boolean box1 = sharedPreferences.getBoolean("box1", false);

		return box1;
	}
	
	private boolean box2() {
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
		boolean box2 = sharedPreferences.getBoolean("box2", false);

		return box2;
	}
	
	private int timeDelay(){
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
		String spinnerValue = sharedPreferences.getString("spinnerValue", "0");
		
		return Integer.parseInt(spinnerValue);
	}
}
