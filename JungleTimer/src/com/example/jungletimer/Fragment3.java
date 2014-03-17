package com.example.jungletimer;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Fragment3 extends Fragment {

	private Button baron;
	private Button drake;

	private Button inibblue1;
	private Button inibblue2;
	private Button inibblue3;
	private Button blueblue;
	private Button redblue;
	private Button newblue;
	private Button golemblue;
	private Button wraithblue;
	private Button wolvesblue;

	private Button inibpurple1;
	private Button inibpurple2;
	private Button inibpurple3;
	private Button bluepurple;
	private Button redpurple;
	private Button newpurple;
	private Button golempurple;
	private Button wraithpurple;
	private Button wolvespurple;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment3, container, false);

		// Inicialitzacio de Buttons

		// Baron
		baron = (Button) rootView.findViewById(R.id.baron);

		baron.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				baron.setEnabled(false);
				baron.setBackgroundResource(R.drawable.barondead);
				matarBaron();
			}
		});

		// Drake
		drake = (Button) rootView.findViewById(R.id.drake);

		drake.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				drake.setEnabled(false);
				drake.setBackgroundResource(R.drawable.drakedead);
				matarDrake();
			}
		});

		// Blue Team
		inibblue1 = (Button) rootView.findViewById(R.id.inibblue4);
		inibblue1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibblue1.setEnabled(false);
				inibblue1.setBackgroundResource(R.drawable.inibdead);
				matarInibblue1();
			}
		});
		inibblue2 = (Button) rootView.findViewById(R.id.inibblue5);
		inibblue2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibblue2.setEnabled(false);
				inibblue2.setBackgroundResource(R.drawable.inibdead);
				matarInibblue2();
			}
		});

		inibblue3 = (Button) rootView.findViewById(R.id.inibblue3);
		inibblue3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibblue3.setEnabled(false);
				inibblue3.setBackgroundResource(R.drawable.inibdead);
				matarInibblue3();
			}
		});

		golemblue = (Button) rootView.findViewById(R.id.golemsblue5);
		golemblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				golemblue.setEnabled(false);
				golemblue.setBackgroundResource(R.drawable.golemdead);
				matarGolemBlue();
			}
		});
		wraithblue = (Button) rootView.findViewById(R.id.wraithblue5);
		wraithblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wraithblue.setEnabled(false);
				wraithblue.setBackgroundResource(R.drawable.wraithdead);
				matarWraithBlue();
			}
		});
		wolvesblue = (Button) rootView.findViewById(R.id.wolvesblue5);
		wolvesblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wolvesblue.setEnabled(false);
				wolvesblue.setBackgroundResource(R.drawable.wolvesdead);
				matarWolvesBlue();
			}
		});

		blueblue = (Button) rootView.findViewById(R.id.blueblue);
		blueblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				blueblue.setEnabled(false);
				blueblue.setBackgroundResource(R.drawable.bluedead);
				matarBlueBlue();
			}
		});

		redblue = (Button) rootView.findViewById(R.id.redblue);
		redblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				redblue.setEnabled(false);
				redblue.setBackgroundResource(R.drawable.reddead);
				matarRedBlue();
			}
		});

		newblue = (Button) rootView.findViewById(R.id.newblue);
		newblue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				newblue.setEnabled(false);
				newblue.setBackgroundResource(R.drawable.newdead);
				matarNewBlue();
			}
		});

		// Purple Team
		wolvespurple = (Button) rootView.findViewById(R.id.wolvespurple5);
		wolvespurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wolvespurple.setEnabled(false);
				wolvespurple.setBackgroundResource(R.drawable.wolvesdead);
				matarWolvesPurple();
			}
		});
		inibpurple1 = (Button) rootView.findViewById(R.id.inibpurple4);
		inibpurple1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibpurple1.setEnabled(false);
				inibpurple1.setBackgroundResource(R.drawable.inibdead);
				matarInibPurple1();
			}
		});
		inibpurple2 = (Button) rootView.findViewById(R.id.inibpurple5);
		inibpurple2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibpurple2.setEnabled(false);
				inibpurple2.setBackgroundResource(R.drawable.inibdead);
				matarInibPurple2();
			}
		});
		inibpurple3 = (Button) rootView.findViewById(R.id.inibpurple3);
		inibpurple3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				inibpurple3.setEnabled(false);
				inibpurple3.setBackgroundResource(R.drawable.inibdead);
				matarInibPurple3();
			}
		});
		golempurple = (Button) rootView.findViewById(R.id.golemspurple5);
		golempurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				golempurple.setEnabled(false);
				golempurple.setBackgroundResource(R.drawable.golemdead);
				matarGolemsPurple();
			}
		});
		wraithpurple = (Button) rootView.findViewById(R.id.wraithpurple5);
		wraithpurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				wraithpurple.setEnabled(false);
				wraithpurple.setBackgroundResource(R.drawable.wraithdead);
				matarWraithsPurple();
			}
		});

		bluepurple = (Button) rootView.findViewById(R.id.bluepurple);
		bluepurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				bluepurple.setEnabled(false);
				bluepurple.setBackgroundResource(R.drawable.bluedead);
				matarBluePurple();
			}
		});

		redpurple = (Button) rootView.findViewById(R.id.redpurple);
		redpurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				redpurple.setEnabled(false);
				redpurple.setBackgroundResource(R.drawable.reddead);
				matarRedPurple();
			}
		});

		newpurple = (Button) rootView.findViewById(R.id.newpurple);
		newpurple.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				newpurple.setEnabled(false);
				newpurple.setBackgroundResource(R.drawable.newdead);
				matarNewPurple();
			}
		});

		return rootView;
	}

	// //////////////////////////////////////////////////////////////////
	// mètodes de cronòmetre
	// //////////////////////////////////////////////////////////////////

	private void matarBaron() {

		new CountDownTimer(420000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				baron.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				baron.setEnabled(true);
				baron.setText("");
				baron.setBackgroundResource(R.drawable.baron);
			}
		}.start();
	}
	
	private void matarDrake() {

		new CountDownTimer(360000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				drake.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				drake.setEnabled(true);
				drake.setText("");
				drake.setBackgroundResource(R.drawable.drake);
			}
		}.start();
	}

	private void matarInibblue1() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibblue1.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
	
	private void matarInibblue3() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibblue3.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				inibblue3.setEnabled(true);
				inibblue3.setText("");
				inibblue3.setBackgroundResource(R.drawable.inibblue);
			}
		}.start();
	}

	private void matarBlueBlue() {
		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				blueblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				blueblue.setEnabled(true);
				blueblue.setText("");
				blueblue.setBackgroundResource(R.drawable.blueblue);
			}
		}.start();
	}

	private void matarRedBlue() {
		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				redblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				redblue.setEnabled(true);
				redblue.setText("");
				redblue.setBackgroundResource(R.drawable.redblue);
			}
		}.start();
	}
	
	private void matarNewBlue() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				newblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				newblue.setEnabled(true);
				newblue.setText("");
				newblue.setBackgroundResource(R.drawable.newblue);
			}
		}.start();
	}

	private void matarGolemBlue() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				golemblue.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				if (millisUntilFinished / 1000 == timeDelay()) {
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
	
	private void matarInibPurple3() {

		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				inibpurple3.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				inibpurple3.setEnabled(true);
				inibpurple3.setText("");
				inibpurple3.setBackgroundResource(R.drawable.inibpurple);
			}
		}.start();
	}

	private void matarBluePurple() {
		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				bluepurple.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				bluepurple.setEnabled(true);
				bluepurple.setText("");
				bluepurple.setBackgroundResource(R.drawable.bluepurple);
			}
		}.start();
	}

	private void matarRedPurple() {
		new CountDownTimer(300000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				redpurple.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				redpurple.setEnabled(true);
				redpurple.setText("");
				redpurple.setBackgroundResource(R.drawable.redpurple);
			}
		}.start();
	}
	
	private void matarNewPurple() {
		new CountDownTimer(50000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				newpurple.setText("" + millisUntilFinished / 1000);
				if (millisUntilFinished / 1000 == timeDelay()) {
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
				newpurple.setEnabled(true);
				newpurple.setText("");
				newpurple.setBackgroundResource(R.drawable.newpurple);
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
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getActivity().getBaseContext());
		boolean box1 = sharedPreferences.getBoolean("box1", false);

		return box1;
	}

	private boolean box2() {
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getActivity().getBaseContext());
		boolean box2 = sharedPreferences.getBoolean("box2", false);

		return box2;
	}

	private int timeDelay() {
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getActivity().getBaseContext());
		String spinnerValue = sharedPreferences.getString("spinnerValue", "0");

		return Integer.parseInt(spinnerValue);
	}
}
