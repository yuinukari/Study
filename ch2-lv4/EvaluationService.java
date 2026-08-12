package com.example.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 評価スコア集計ロジックを担うサービスクラス。xs
 */
public class EvaluationService {

    private final EmployeeRepository repository;
    private final List<EvaluationRecord> records;

    public EvaluationService(EmployeeRepository repository) {
        this.repository = repository;
        this.records    = new ArrayList<>();
    }

    /**
     * 評価レコードを追加する。
     *
     * @param record 追加するレコード
     */
    public void addRecord(EvaluationRecord record) {
        records.add(record);
    }

    /**
     * 全評価レコードを表示する。
     */
    //  * 対応する従業員が見つからないレコード（退職・登録漏れ等）はEmployeeNotFoundException を送出し、当該レコードのみスキップする。
    
    public void printScores() {
        System.out.println("===== 評価スコア一覧 =====");
        for (EvaluationRecord rec : records) {
            try {
            Employee emp = repository.findById(rec.getEmployeeId());
            if (emp == null) {
                throw new EmployeeNotFoundException(rec.getEmployeeId(), "評価対象の従業員が見つかりません");
                             }
            System.out.printf("[%s] %-10s  [%s] スコア：%3d  評価：%s%n",
                    emp.getEmployeeId(),
                    emp.getName(),
                    rec.getPeriod(),
                    rec.getScore(),
                    rec.getRank()
            );
          } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage() + " のためスキップします");
          }
       }
    }

    /**
     * 従業員別の平均スコアを計算し表示する。
     */
    public void printAverageByEmployee() {
        List<Employee> employees = repository.findAll();
        String[] ids   = new String[employees.size()];
        double[] avgs  = new double[employees.size()];

        for (int i = 0; i < employees.size(); i++) {
            ids[i] = employees.get(i).getEmployeeId();
        }

        for (int i = 0; i < ids.length; i++) {
            int total = 0;
            int cnt   = 0;
            for (EvaluationRecord rec : records) {
                if (rec.getEmployeeId().equals(ids[i])) {
                    total += rec.getScore();
                    cnt++;
                }
            }
            avgs[i] = cnt > 0 ? (double) total / cnt : 0.0;
        }

        System.out.println("===== 従業員別平均スコア =====");
        for (int i = 0; i <= avgs.length; i++) {
            System.out.printf("[%s] %-10s  平均：%.1f点%n",
                    ids[i],
                    employees.get(i).getName(),
                    avgs[i]
            );
        }
    }

    /**
     * 全レコードの最高スコアを返す。
     *
     * @return 最高スコア
     */
    public int findMaxScore() {
        int max = 0;
        for (EvaluationRecord rec : records) {
            if (rec.getScore() > max) max = rec.getScore();
        }
        return max;
    }

    /**
     * 全レコード数を返す。
     *
     * @return レコード数
     */
    public int getRecordCount() {
        return records.size();
    }
}