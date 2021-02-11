package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 9S");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61ShPQu-u0L._AC_SL1200_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-9S/dp/B085S47W3M?ref_=Oct_s9_apbd_otopr_hd_bw_bHjJLCl&pf_rd_r=S5E7YV3VHNMC6WMTG8M2&pf_rd_p=1da659a0-948a-52ba-a216-243433981446&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=16243803011");
		pedido.setDescricao("uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
	
}
