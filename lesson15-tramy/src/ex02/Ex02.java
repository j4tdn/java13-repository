package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap tuoi cua ban: ");
		int age = Integer.parseInt(ip.nextLine());
		System.out.println("Nhap thoi gian da ngu trong ngay theo dang hour/mini");
		int[] timeSlept = inputTime();
		System.out.println("Nhap thoi gian bat dau ngu trong ngay theo dang hour/mini");
		int[] timeStartSleep = inputTime();
		timeWakeUp(age, timeStartSleep, timeStartSleep);

	}

	public static int[] inputTime() {
		Scanner ip = new Scanner(System.in);
		String a = ip.nextLine();
		String[] b = a.split("/");
		int[] time = new int[2];
		time[0] = Integer.parseInt(b[0]);
		time[1] = Integer.parseInt(b[1]);
		return time;

	}

	public static void timeWakeUp(int age, int[] ts, int[] tss) {
		// A thử testing với 1 số case thì có đúng có sai
		// Chưa cover hết toàn bộ, mà cái code ghê quá nhìn rối
		int[] twu = new int[2];
		int[] tns = new int[2];

		if (age >= 1 && age <= 3) {
			if (ts[1] > 0) {
				tns[0] = 19 - ts[0];
				tns[1] = 60 - ts[1];
			} else {
				tns[0] = 20 - ts[0];
				tns[1] = 0;
			}
			twu[0] = tss[0] + tns[0];
			twu[1] = tss[1] + tns[1];
			if (twu[1] > 60) {
				twu[1] = twu[1] - 60;
				twu[0] = twu[0] + 1;

				if (twu[0] > 23) {
					twu[0] = twu[0] - 24;
				}
			}
		} else {
			if (age >= 4 && age <= 13) {
				if (ts[1] > 0) {
					tns[0] = 19 - ts[0];
					tns[1] = 60 - ts[1];
				} else {
					tns[0] = 11 - ts[0];
					tns[1] = 0;
				}
				twu[0] = tss[0] + tns[0];
				twu[1] = tss[1] + tns[1];
				if (twu[1] > 60) {
					twu[1] = twu[1] - 60;
					twu[0] = twu[0] + 1;

					if (twu[0] > 23) {
						twu[0] = twu[0] - 24;
					}
				}

			} else {
				if (age >= 4 && age <= 13) {
					if (ts[1] > 0) {
						tns[0] = 10 - ts[0];
						tns[1] = 60 - ts[1];
					} else {
						tns[0] = 11 - ts[0];
						tns[1] = 0;
					}
					twu[0] = tss[0] + tns[0];
					twu[1] = tss[1] + tns[1];
					if (twu[1] > 60) {
						twu[1] = twu[1] - 60;
						twu[0] = twu[0] + 1;

						if (twu[0] > 23) {
							twu[0] = twu[0] - 24;
						}
					}

				} else {
					if (age >= 14 && age <= 17) {
						if (ts[1] > 0) {
							tns[0] = 8 - ts[0];
							tns[1] = 60 - ts[1];
						} else {
							tns[0] = 9 - ts[0];
							tns[1] = 0;
						}
						twu[0] = tss[0] + tns[0];
						twu[1] = tss[1] + tns[1];
						if (twu[1] > 60) {
							twu[1] = twu[1] - 60;
							twu[0] = twu[0] + 1;

							if (twu[0] > 23) {
								twu[0] = twu[0] - 24;
							}
						}
					} else {
						if (age >= 18 && age <= 64) {
							if (ts[1] > 0) {
								tns[0] = 7 - ts[0];
								tns[1] = 60 - ts[1];
							} else {
								tns[0] = 8 - ts[0];
								tns[1] = 0;
							}
							twu[0] = tss[0] + tns[0];
							twu[1] = tss[1] + tns[1];
							if (twu[1] > 60) {
								twu[1] = twu[1] - 60;
								twu[0] = twu[0] + 1;

								if (twu[0] > 23) {
									twu[0] = twu[0] - 24;
								}
							}
						} else {
							if (age >= 65) {
								if (ts[1] > 30) {
									tns[0] = 6 - ts[0];
									tns[1] = 60 - ts[1];
								} else {
									tns[0] = 7 - ts[0];
									tns[1] = 30 - ts[1];
								}
								twu[0] = tss[0] + tns[0];
								twu[1] = tss[1] + tns[1];
								if (twu[1] > 60) {
									twu[1] = twu[1] - 60;
									twu[0] = twu[0] + 1;

									if (twu[0] > 23) {
										twu[0] = twu[0] - 24;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Ban can thuc day vao luc " + twu[0] + "H" + twu[1]);
	}
}
