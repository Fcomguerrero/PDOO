# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

#juega el papel de clase Abstracta
class FiguraGeometrica

attr_accessor :numLados

  def initialize(lados)
      @numLados=lados
  end  
  
private_class_method :new

  #metodos Abstractos no implementados
  def perimetro                 
    raise NotImplementedError.new
  end
  
  def area
    raise NotImplementedError.new
  end
  
  def to_s
  "\nSoy una figura geometrica de #{@numLados} lados"
end 
  
  
end#class