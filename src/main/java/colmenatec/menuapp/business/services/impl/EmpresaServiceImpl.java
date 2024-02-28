package colmenatec.menuapp.business.services.impl;

import colmenatec.menuapp.business.services.IEmpresaService;
import colmenatec.menuapp.business.services.ISucursalService;
import colmenatec.menuapp.domain.entities.Empresa;
import colmenatec.menuapp.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa,Long> implements IEmpresaService {

    @Autowired
    private ISucursalService sucursalService;

    @Override
    public Empresa asignarSucursales(Long id,List<Long> sucursalesIds) {
        var empresa = getById(id);
        var sucursales = sucursalService.getAll().stream()
                .filter(sucursal -> sucursalesIds.contains(sucursal.getId()))
                .collect(Collectors.toList());
        sucursales.forEach(sucursal -> {
            empresa.getSucursales().add(sucursal);
        });

        return update(empresa);
    }
}
