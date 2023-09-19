
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{

   private int rank; // classifucação, ranking
   private String name; // nome da empresa
   private String industry; // setor
   private int revenue; // receita em milhões de dólares
   private double revenueGrowth; // crescimento da receita
   private int employees; // qtd funcionários
   private String headquarters; // local sede
   
   //private int ventoVelocidadeMaxima;
   //private String ventoDirecao;

    public int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the insdustry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param insdustry the insdustry to set
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * @return the revenue
     */
    public int getRevenue() {
        return revenue;
    }

    /**
     * @param revenue the revenue to set
     */
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    /**
     * @return the revenueGrowth
     */
    public double getRevenueGrowth() {
        return revenueGrowth;
    }

    /**
     * @param revenueGrowth the revenueGrowth to set
     */
    public void setRevenueGrowth(double revenueGrowth) {
        this.revenueGrowth = revenueGrowth;
    }

    /**
     * @return the employees
     */
    public int getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    /**
     * @return the headquarters
     */
    public String getHeadquarters() {
        return headquarters;
    }

    /**
     * @param headquarters the headquarters to set
     */
    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }
  
    
    // Métodos para controlar o objeto cidade
    @Override   
    public boolean compareTo(Dados outroDado){
      return this.getHeadquarters().compareTo(outroDado.getHeadquarters());
   }
    
    /*@Override
    public String toString(){
    return getHeadquarters()+ " : " + getCondicao() ;
    }// fim toString
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return cidade.equals(dados.cidade);
    }
*/

