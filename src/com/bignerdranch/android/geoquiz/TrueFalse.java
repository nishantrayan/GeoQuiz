package com.bignerdranch.android.geoquiz;

public class TrueFalse {
	private int mQuestion;
	private boolean mTrueQuestion;

	public TrueFalse(int mQuestion, boolean mTrueQuestion) {
		super();
		this.mQuestion = mQuestion;
		this.mTrueQuestion = mTrueQuestion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}

	
}
