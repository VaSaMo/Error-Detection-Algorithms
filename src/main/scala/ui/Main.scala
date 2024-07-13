package ui
import dataAnalysis.DataAnalysis

@main
def main(): Unit = {
  val analysis:DataAnalysis = new DataAnalysis
  analysis.generateData()

}
