CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(

    p_loanAmount NUMBER,
    p_interestRate NUMBER,
    p_durationYears NUMBER

)

RETURN NUMBER

IS

    v_monthlyInstallment NUMBER;

BEGIN

    v_monthlyInstallment :=
    (p_loanAmount +
    (p_loanAmount * p_interestRate * p_durationYears /100))
    /(p_durationYears*12);

    RETURN ROUND(v_monthlyInstallment,2);

END;
/