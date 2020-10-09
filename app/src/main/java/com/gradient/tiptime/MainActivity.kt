<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#faf8eb"
    android:padding="20dp"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/cost_of_service"
        android:layout_width="160dp"
        android:layout_height="wrap_content"
        android:fontFamily="sans-serif-medium"
        android:hint="@string/cost_of_service"
        android:inputType="numberDecimal"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/split_num"
        android:layout_width="160dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="180dp"
        android:fontFamily="sans-serif-medium"
        android:hint="Split between"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/service_question"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="sans-serif"
        android:text="@string/how_was_the_service"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/cost_of_service" />

    <RadioGroup
        android:id="@+id/tip_options"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checkedButton="@+id/option_twenty_percent"
        android:orientation="vertical"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/service_question">

        <RadioButton
            android:id="@+id/option_twenty_percent"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="sans-serif"
            android:text="@string/amazing_20" />

        <RadioButton
            android:id="@+id/option_eighteen_percent"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="sans-serif"
            android:text="@string/good_18" />

        <RadioButton
            android:id="@+id/option_fifteen_percent"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="sans-serif"
            android:text="@string/ok_15" />

    </RadioGroup>

    <Switch
        android:id="@+id/round_up_switch"
        android:layout_width="310dp"
        android:layout_height="wrap_content"
        android:checked="true"
        android:fontFamily="sans-serif"
        android:text="@string/round_up_tip"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/tip_options"
        tools:ignore="UseSwitchCompatOrMaterialXml" />

    <Button
        android:id="@+id/calculate_button"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:backgroundTint="#f2747e"
        android:fontFamily="sans-serif"
        android:text="@string/calculate"
        android:textSize="15sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/round_up_switch" />

    <TextView
        android:id="@+id/tip_result"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="15dp"
        android:fontFamily="sans-serif-medium"
        android:text="Tip amount: "
        android:textColor="#5c5c5c"
        android:textSize="20sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/calculate_button" />

    <TextView
        android:id="@+id/total_cost"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="15dp"
        android:fontFamily="sans-serif-medium"
        android:text="Total payment: "
        android:textColor="#5c5c5c"
        android:textSize="20sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/tip_result" />

    <TextView
        android:id="@+id/split_cost"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="15dp"
        android:fontFamily="sans-serif-medium"
        android:text="Split cost:  "
        android:textColor="#5c5c5c"
        android:textSize="20sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/total_cost" />


</androidx.constraintlayout.widget.ConstraintLayout>
