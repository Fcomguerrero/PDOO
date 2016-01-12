# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative 'figura_geometrica'

class Rectangulo < FiguraGeometrica


  include FiguraGrafica
  
  def initialize(la,lb,bd) 
    super(4)
    @ladoA = la
    @ladoB=lb
    @GrosorBorde = bd
  end
  
  public_class_method :new

  def perimetro
      @ladoA*2 + @ladoB*2     
  end
  
  def area
     @ladoA*@ladoB
  end
  
  def pintarBorde(color)
    "Color = #{color}, Grosor = #{@GrosorBorde}"
  end
  
  def colorear(color)
    "#{color}"
  end
  
  def to_s
    super.to_s + "\nDe perimetro : #{self.perimetro} \nArea: #{self.area} 
\nPintado en color #{self.colorear("azul")} y \nBorde: #{self.pintarBorde("rojo")}"
end  
  
  
end#class

